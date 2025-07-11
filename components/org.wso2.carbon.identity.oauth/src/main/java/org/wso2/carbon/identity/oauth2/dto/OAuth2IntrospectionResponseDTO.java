/*
 * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth2.dto;

import org.wso2.carbon.identity.application.authentication.framework.model.AuthenticatedUser;

import java.util.HashMap;
import java.util.Map;

/**
 * OAuth 2 introspection request DTO.
 */
public class OAuth2IntrospectionResponseDTO {

    /*
     * REQUIRED. Boolean indicator of whether or not the presented token is currently active. The specifics of a token's
     * "active" state will vary depending on the implementation of the authorization server and the information it keeps
     * about its tokens, but a "true" value return for the "active" property will generally indicate that a given token
     * has been issued by this authorization server, has not been revoked by the resource owner, and is within its given
     * time window of validity (e.g., after its issuance time and before its expiration time). See Section 4 for
     * information on implementation of such checks.
     */
    private boolean active;

    /*
     * OPTIONAL. A JSON string containing a space-separated list of scopes associated with this token, in the format
     * described in Section 3.3 of OAuth 2.0
     */
    private String scope;

    /*
     * OPTIONAL. Client identifier for the OAuth 2.0 client that requested this token.
     */
    private String clientId;

    /*
     * OPTIONAL. Human-readable identifier for the resource owner who authorized this token.
     */
    private String username;

    /*
     * OPTIONAL. Type of the token as defined in Section 5.1 of OAuth 2.0
     */
    private String tokenType;

    /*
     * OPTIONAL. Integer time-stamp, measured in the number of seconds since January 1 1970 UTC, indicating when this
     * token is not to be used before, as defined in JWT
     */
    private long nbf;

    /*
     * OPTIONAL. Service-specific string identifier or list of string identifiers representing the intended audience for
     * this token, as defined in JWT
     */
    private String aud;

    /*
     * OPTIONAL. String representing the issuer of this token, as defined in JWT
     */
    private String iss;

    /*
     * OPTIONAL. String identifier for the token, as defined in JWT
     */
    private String jti;

    /*
     * OPTIONAL. Subject of the token, as defined in JWT [RFC7519]. Usually a machine-readable identifier of the
     * resource owner who authorized this token.
     */
    private String sub;

    /*
     * OPTIONAL. Integer time-stamp, measured in the number of seconds since January 1 1970 UTC, indicating when this
     * token will expire, as defined in JWT
     */
    private long exp;

    /*
     * OPTIONAL. Integer time-stamp, measured in the number of seconds since January 1 1970 UTC, indicating when this
     * token was originally issued, as defined in JWT
     */
    private long iat;

    private String userContext;

    /*
     * OPTIONAL. Token binding type.
     */
    private String bindingType;

    /*
     * OPTIONAL. Token binding reference.
     */
    private String bindingReference;
    private String cnfBindingValue;

    /**
     * OPTIONAL. Authorized user type of the token. (APPLICATION or APPLICATION_USER)
     */
    private String aut;

    /*
     * OPTIONAL. Represents the resource owner who authorized this token.
     */
    private AuthenticatedUser authorizedUser;

    /*
     * OPTIONAL. Selected ACR value of user authentication
     */
    private String acr;

    /*
     * OPTIONAL. Current authentication time
     */
    private long authTime;

    /*
     * this is used for extensions.
     */
    private Map<String, Object> properties = new HashMap<String, Object>();

    private String error;

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {

        this.active = active;
    }

    public String getScope() {

        return scope;
    }

    public void setScope(String scope) {

        this.scope = scope;
    }

    public String getClientId() {

        return clientId;
    }

    public void setClientId(String clientId) {

        this.clientId = clientId;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getTokenType() {

        return tokenType;
    }

    public void setTokenType(String tokenType) {

        this.tokenType = tokenType;
    }

    public long getNbf() {

        return nbf;
    }

    public void setNbf(long nbf) {

        this.nbf = nbf;
    }

    public String getAud() {

        return aud;
    }

    public void setAud(String aud) {

        this.aud = aud;
    }

    public String getIss() {

        return iss;
    }

    public void setIss(String iss) {

        this.iss = iss;
    }

    public String getJti() {

        return jti;
    }

    public void setJti(String jti) {

        this.jti = jti;
    }

    public String getSub() {

        return sub;
    }

    public void setSub(String sub) {

        this.sub = sub;
    }

    public long getExp() {

        return exp;
    }

    public void setExp(long exp) {

        this.exp = exp;
    }

    public long getIat() {

        return iat;
    }

    public void setIat(long iat) {

        this.iat = iat;
    }

    public Map<String, Object> getProperties() {

        return properties;
    }

    public void setProperties(Map<String, Object> properties) {

        this.properties = properties;
    }

    public String getError() {

        return error;
    }

    public void setError(String error) {

        this.error = error;
    }

    public String getUserContext() {

        return userContext;
    }

    public void setUserContext(String userContext) {

        this.userContext = userContext;
    }

    public String getBindingType() {

        return bindingType;
    }

    public void setBindingType(String bindingType) {

        this.bindingType = bindingType;
    }

    public String getBindingReference() {

        return bindingReference;
    }

    public void setCnfBindingValue(String cnfBindingValue) {

        this.cnfBindingValue = cnfBindingValue;
    }

    public String getCnfBindingValue() {

        return cnfBindingValue;
    }

    public void setBindingReference(String bindingReference) {

        this.bindingReference = bindingReference;
    }

    public String getAut() {

        return aut;
    }

    public void setAut(String aut) {

        this.aut = aut;
    }

    public AuthenticatedUser getAuthorizedUser() {

        return authorizedUser;
    }

    public void setAuthorizedUser(AuthenticatedUser authorizedUser) {

        this.authorizedUser = authorizedUser;
    }

    public String getAcr() {

        return acr;
    }

    public void setAcr(String acr) {

        this.acr = acr;
    }

    public long getAuthTime() {

        return authTime;
    }

    public void setAuthTime(long authTime) {

        this.authTime = authTime;
    }

}
