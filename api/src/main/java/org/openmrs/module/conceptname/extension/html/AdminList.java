package org.openmrs.module.conceptname.extension.html;


import java.util.LinkedHashMap;
import java.util.Map;
 
import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.AdministrationSectionExt;
 
/**
 * This class defines the links that will appear on the administration page under the
 * "conceptname.title" heading.
 */
public class AdminList extends AdministrationSectionExt {
 
 /**
 * @see AdministrationSectionExt#getMediaType()
 */
 public Extension.MEDIA_TYPE getMediaType() {
 return Extension.MEDIA_TYPE.html;
 }
 
 /**
 * @see AdministrationSectionExt#getTitle()
 */
 public String getTitle() {
 return "Concept Name Management";
 }
 
 /**
 * @see AdministrationSectionExt#getLinks()
 */
 public Map<String, String> getLinks() {
 LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
 map.put("/module/conceptname/viewConceptNames.form", "conceptname.manage");
 return map;
 }
 
}