package org.openmrs.module.conceptname;

import org.openmrs.Concept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConceptNameManageController {
 
 @ModelAttribute
 public Concept getConcept(@RequestParam(required=false, value="conceptId")Concept concept){
 return concept;
 }
 @RequestMapping(value="/module/conceptname/viewConceptNames",method=RequestMethod.GET)
 public void showForm(){
 
 }
}