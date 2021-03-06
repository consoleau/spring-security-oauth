package org.springframework.security.oauth2.provider.exchange;

import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;

/**
 * {@link TokenExchangeService} deals with validating the supplied {@link TokenExchangeAuthenticationToken} which details the
 * token-exchange request, and returning the user associated with it.
 *
 * @author Ryan Murfitt
 */
public interface TokenExchangeService {

    UserDetails loadUserDetailsFromToken(TokenExchangeAuthenticationToken tokenAuth) throws AccountStatusException, InvalidTokenException;
}
