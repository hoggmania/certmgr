/*
 * Copyright (c) 2015-2016 Holger de Carne and contributors, All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.carne.certmgr.certs.spi;

import de.carne.certmgr.certs.UserCertStore;
import de.carne.certmgr.certs.security.DefaultSet;
import de.carne.certmgr.certs.security.KeyPairAlgorithm;
import de.carne.certmgr.certs.security.SignatureAlgorithm;
import de.carne.certmgr.certs.signer.Issuer;

/**
 * Service provider interface for certificate signing.
 */
public interface CertSigner extends NamedProvider {

	/**
	 * Get this provider's description.
	 *
	 * @return This provider's description.
	 */
	String getDescription();

	/**
	 * Get the available issuers.
	 *
	 * @param store The store to use for issuer provisioning.
	 * @return The available issuers (may be an empty set).
	 */
	DefaultSet<Issuer> getIssuers(UserCertStore store);

	DefaultSet<SignatureAlgorithm> getSignatureAlgorithms(KeyPairAlgorithm keyPairAlgorithm, Issuer issuer,
			boolean expertMode);

}