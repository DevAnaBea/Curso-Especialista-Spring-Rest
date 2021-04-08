package com.algaworks.algafood.jpa;

import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager maneger;

    public List<Cozinha> listar() {
        return maneger.createQuery("from Cozinha", Cozinha.class)
                .getResultList();
    }

    public  Cozinha buscar(Long id) {
        return maneger.find(Cozinha.class, id);
    }

    @Transactional
    public Cozinha salvar(Cozinha cozinha) {
        return maneger.merge(cozinha);
    }
}
