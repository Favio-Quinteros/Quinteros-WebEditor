/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AsmetaLStandaloneSetup extends AsmetaLStandaloneSetupGenerated {
  public static void doSetup() {
    new AsmetaLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
