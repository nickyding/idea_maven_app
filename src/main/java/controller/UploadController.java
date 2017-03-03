package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class UploadController {
    @RequestMapping(value = "/saveuploads", method = RequestMethod.POST)
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file,
            HttpServletRequest request, ModelMap model) throws Exception {
        if (!file.isEmpty()) {
            String path = request.getSession().getServletContext().getRealPath("upload");
            String fileName = file.getOriginalFilename();
            File targetFile = new File(path, fileName);
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }
            try {
                file.transferTo(targetFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
            model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);
            return "success";
        } else {
            return "fail";
        }
    }
}
