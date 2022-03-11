import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_turmas_controleTurma_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/controleTurma/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
expressionOut.print(controleTurma.codigo)
printHtmlPart(3)
expressionOut.print(controleTurma.disciplina)
printHtmlPart(4)
expressionOut.print(controleTurma.horario)
printHtmlPart(5)
expressionOut.print(controleTurma.qtdMaximaAlunos)
printHtmlPart(6)
expressionOut.print(controleTurma.alunosMatriculados)
printHtmlPart(7)
expressionOut.print(controleTurma.id)
printHtmlPart(8)
})
invokeTag('formRemote','g',22,['name':("frmTurma"),'url':([controller: 'controleTurma', action: 'salvar']),'update':("divMensagem"),'onSuccess':("carregarLista()")],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1646941447495L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
