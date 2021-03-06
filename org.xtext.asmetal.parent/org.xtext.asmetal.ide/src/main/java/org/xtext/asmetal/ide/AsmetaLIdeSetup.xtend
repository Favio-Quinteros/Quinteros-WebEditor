/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.asmetal.AsmetaLRuntimeModule
import org.xtext.asmetal.AsmetaLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AsmetaLIdeSetup extends AsmetaLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AsmetaLRuntimeModule, new AsmetaLIdeModule))
	}
	
}
