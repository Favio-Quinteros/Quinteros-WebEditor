/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.asmetal.AsmetaLRuntimeModule;
import org.xtext.asmetal.AsmetaLStandaloneSetup;
import org.xtext.asmetal.ide.AsmetaLIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class AsmetaLWebSetup extends AsmetaLStandaloneSetup {
  @Override
  public Injector createInjector() {
    AsmetaLRuntimeModule _asmetaLRuntimeModule = new AsmetaLRuntimeModule();
    AsmetaLIdeModule _asmetaLIdeModule = new AsmetaLIdeModule();
    AsmetaLWebModule _asmetaLWebModule = new AsmetaLWebModule();
    return Guice.createInjector(Modules2.mixin(_asmetaLRuntimeModule, _asmetaLIdeModule, _asmetaLWebModule));
  }
}
