 
import groovy.json.JsonSlurper
import java.io.File
import java.io.Reader
import java.io.FileReader
import java.io.BufferedReader

 

 def slurper = new JsonSlurper() 
  

 BufferedReader inReader = new BufferedReader(new FileReader("jsondata.txt"));

 Reader readJson = inReader ;
  
 def result = slurper.parse(readJson)



 println "The json result is  "+result
 
 Map personMap = result.person2
  
  

