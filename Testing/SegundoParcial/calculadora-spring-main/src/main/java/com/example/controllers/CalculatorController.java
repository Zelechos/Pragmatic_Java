package com.example.controllers;
import com.example.service.CalculateSimple;
import com.example.model.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
    OperationModel operationModel = new OperationModel();

    @Autowired
    private CalculateSimple calculateSimple;

    @RequestMapping("/calculadora")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.add(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.subtract(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="fibonacci", method = RequestMethod.POST)
    public String fibonacci(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.fibonacci(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.sqrt(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="power", method = RequestMethod.POST)
    public String power(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.power(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="factorial", method = RequestMethod.POST)
    public String factorial(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.factorial(operationModel));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearSimple(operationModel));
        model.addAttribute("result", 0);
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="clearAdvanced", method = RequestMethod.POST)
    public String clearAdvanced(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearAdvanced(operationModel));
        model.addAttribute("result", 0);
        return "calculadora";
    }
}
