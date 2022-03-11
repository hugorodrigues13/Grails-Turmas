import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_turmas_controleTurma_lista_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/controleTurma/_lista.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (turmas.size() > 0)) {
printHtmlPart(2)
for( controleTurma in (turmas) ) {
printHtmlPart(3)
expressionOut.print(controleTurma?.codigo)
printHtmlPart(4)
expressionOut.print(controleTurma?.disciplina)
printHtmlPart(4)
expressionOut.print(controleTurma?.horario)
printHtmlPart(4)
expressionOut.print(controleTurma?.qtdMaximaAlunos)
printHtmlPart(4)
expressionOut.print(controleTurma?.alunosMatriculados)
printHtmlPart(5)
createClosureForHtmlPart(6, 3)
invokeTag('remoteLink','g',27,['controller':("controleTurma"),'action':("alterar"),'update':("divForm"),'id':(controleTurma.id)],3)
printHtmlPart(7)
expressionOut.print(controleTurma.id)
printHtmlPart(8)
}
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1646940346264L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
