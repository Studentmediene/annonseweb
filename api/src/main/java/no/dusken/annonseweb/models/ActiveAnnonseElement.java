/*
 * Copyright 2013 Studentmediene i Trondheim AS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package no.dusken.annonseweb.models;

/**
 * The <code>ActiveAnnonseElement</code> is an interface put on all annonseweb
 * models that can be set as active or inactive.
 *
 * @author Inge Halsaunet
 */
public interface ActiveAnnonseElement {

    /**
     * Gets the status of this annonseweb element.
     *
     * @return <code>Boolean.TRUE</code> if this element is active. <code>Boolean.FALSE</code> otherwise
     */
    public Boolean getActive();

    /**
     * Sets the status of this annonseweb element.
     *
     * @param active The new status of this element.
     */
    public void setActive(Boolean active);
}
