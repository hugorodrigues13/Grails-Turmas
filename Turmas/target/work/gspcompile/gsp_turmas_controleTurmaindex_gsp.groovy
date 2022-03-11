import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_turmas_controleTurmaindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/controleTurma/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(4)
invokeTag('javascript','g',14,['library':("jquery")],-1)
printHtmlPart(5)
invokeTag('remoteFunction','g',18,['controller':("controleTurma"),'action':("lista"),'update':("divLista")],-1)
printHtmlPart(6)
invokeTag('remoteFunction','g',22,['controller':("controleTurma"),'action':("excluir"),'update':("divLista"),'id':("'+id+'")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',30,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('remoteLink','g',32,['controller':("controleTurma"),'action':("adicionar"),'update':("divForm")],2)
printHtmlPart(11)
invokeTag('render','g',35,['template':("lista"),'model':([turmas: turmas])],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',39,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1646943002475L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
