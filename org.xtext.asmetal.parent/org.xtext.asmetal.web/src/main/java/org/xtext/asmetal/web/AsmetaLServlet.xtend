/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.web

import javax.servlet.annotation.WebServlet
import org.eclipse.xtext.util.DisposableRegistry
import org.eclipse.xtext.web.servlet.XtextServlet

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = 'XtextServices', urlPatterns = '/xtext-service/*')
class AsmetaLServlet extends XtextServlet {
	
	static final long serialVersionUID = 1L
	
	DisposableRegistry disposableRegistry
	
	override init() {
		super.init()
		val injector = new AsmetaLWebSetup().createInjectorAndDoEMFRegistration()
		disposableRegistry = injector.getInstance(DisposableRegistry)
	}
	
	override destroy() {
		if (disposableRegistry !== null) {
			disposableRegistry.dispose()
			disposableRegistry = null
		}
		super.destroy()
	}
	
}
