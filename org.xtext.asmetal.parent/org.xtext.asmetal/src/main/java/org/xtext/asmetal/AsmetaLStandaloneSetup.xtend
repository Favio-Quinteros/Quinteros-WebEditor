/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AsmetaLStandaloneSetup extends AsmetaLStandaloneSetupGenerated {

	def static void doSetup() {
		new AsmetaLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}