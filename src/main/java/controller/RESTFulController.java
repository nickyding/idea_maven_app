package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class RESTFulController {
    @RequestMapping(value = "/populateDataFromServer/{name}",  method= RequestMethod.GET, produces={"application/json"})
    @ResponseBody
    public List<Integer> populateActivePSwapBasketGET(@PathVariable String name) {
        if (name.equalsIgnoreCase("JavaHonk")) {
            return returnDataList();
        } else {
            List<Integer> list = new ArrayList<Integer>();
            list.add(12345);
            return list;
        }

    }

    @RequestMapping(value = "/populateDataFromServer", method=RequestMethod.POST, produces={"application/json"})
    @ResponseBody
    public List<Integer> populateActivePSwapBasketPOST(@RequestParam String name) {
        /*
        if (name.equalsIgnoreCase("JavaHonk")) {
            return returnDataList();
        } else {
            List<Integer> list = new ArrayList<Integer>();
            list.add(12345);
            return list;
        }
        */
        return null;
    }

    @RequestMapping(value = "/populateDataFromServer/{name}", method=RequestMethod.PUT, produces={"application/json"})
    @ResponseBody
    public List<Integer> populateActivePSwapBasketPUT(@PathVariable String name) {
        /*
        if (name.equalsIgnoreCase("JavaHonk")) {
            return returnDataList();
        } else {
            List<Integer> list = new ArrayList<Integer>();
            list.add(12345);
            return list;
        }
        */
        return null;
    }

    @RequestMapping(value = "/populateDataFromServer/{name}", method=RequestMethod.DELETE, produces={"application/json"})
    @ResponseBody
    public List<Integer> populateActivePSwapBasketDelete(@PathVariable String name) {
        /*
        if (name.equalsIgnoreCase("JavaHonk")) {
            return returnDataList();
        } else {
            List<Integer> list = new ArrayList<Integer>();
            list.add(12345);
            return list;
        }
        */
        return null;
    }

    private List<Integer> returnDataList() {
        Random rand = new Random();
        Integer randomNum = rand.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        list.add(randomNum);
        return list;
    }
}
