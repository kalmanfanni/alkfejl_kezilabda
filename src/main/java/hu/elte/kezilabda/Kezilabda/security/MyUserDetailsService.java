package hu.elte.kezilabda.Kezilabda.security;

import hu.elte.kezilabda.Kezilabda.model.Vasarlo;
import hu.elte.kezilabda.Kezilabda.repository.VasarloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class MyUserDetailsService {

    /*@Service
    public class MyUserDetailsService implements UserDetailsService {

        @Autowired
        private AuthenticatedVasarlo authenticatedVasarlo;

        @Autowired
        private VasarloRepository vasarloRepository;

        @Override
        @Transactional(readOnly = true)
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Optional<Vasarlo> oVasarlo = vasarloRepository.findByUsername(username);
            if (!oVasarlo.isPresent()) {
                throw new UsernameNotFoundException(username);
            }
            Vasarlo vasarlo = oVasarlo.get();
            authenticatedVasarlo.setVasarlo(vasarlo);
            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            grantedAuthorities.add(new SimpleGrantedAuthority(vasarlo.getRole().toString()));

            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
        }
    }*/

}
