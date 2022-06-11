package com.mrgiovanotti.auditdatatutorial.auditing;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
	// Solo como ejemplo. Lo ideal sería obtener el usuario que está autenticado
	return Optional.of("someUser");
    }

}
