/*
 * Example of generating XML data using Groovy.
 */

def writer = new StringWriter()
def builder = new groovy.xml.MarkupBuilder(writer)
builder.setDoubleQuotes(true)
builder.items {
    item (id:"1") {
        name "First try with groovy and then Grails"
        note "The Groovy is marvelous!"
    }
item (id:"2") {
        name "Meet Biju Fisrt"
        note "Java Reader Done!"
    }

}

println writer.toString()