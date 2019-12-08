package hu.elte.kezilabda.Kezilabda.security;

import hu.elte.kezilabda.Kezilabda.model.Vasarlo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;


@RequestScope
@Component
@Data
@NoArgsConstructor
public class AuthenticatedVasarlo {
    private Vasarlo vasarlo;
}
