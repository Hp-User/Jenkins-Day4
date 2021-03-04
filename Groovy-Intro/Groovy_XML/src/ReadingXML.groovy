/*
 * Example of using Groovy's XmlSlurper and XPath notation
 * to read and proces XML.
 */
 
def root = new XmlSlurper().parse('user.xml')

//assert 3 == root.todo.size()
//assert "Buy Beginning Groovy and Grails" == todos.todo
//[0].name.text()
//assert "1" == todos.todo[0].@id.text()


println ("The number of todos in xml are  "+root.todo.size())

println ("The fisrt todo in xml is  "+root.todo[0].name.text())


println ("The fisrt todo id in xml is  "+root.todo[0].@id.text())



