/********************************************************************************
 * Copyright (c) 2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package com.eclipsesource.uml.glsp.gmodel;

import com.eclipsesource.uml.glsp.model.UmlModelState;

public class GModelFactoryProvider {

   public static GModelFactory get(final UmlModelState modelState) {
      switch (modelState.getUmlFacade().getDiagram().getDiagramType()) {
         case CLASS: {
            return new UmlClassDiagramModelFactory(modelState);
         }
      }
      return null;
   }

}
