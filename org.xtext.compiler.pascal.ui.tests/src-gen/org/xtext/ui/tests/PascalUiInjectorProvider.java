/*
 * generated by Xtext 2.15.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.compiler.pascal.ui.internal.PascalActivator;

public class PascalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PascalActivator.getInstance().getInjector("org.xtext.Pascal");
	}

}
