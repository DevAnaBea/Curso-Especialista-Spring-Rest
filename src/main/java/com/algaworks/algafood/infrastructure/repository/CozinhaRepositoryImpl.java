package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @PersistenceContext
    private EntityManager maneger;

    @Override
    public List<Cozinha> listar() {
        return maneger.createQuery("from Cozinha", Cozinha.class)
                .getResultList();
    }

    @Override
    public  Cozinha buscar(Long id) {
        return maneger.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha adicionar(Cozinha cozinha) {
        return maneger.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(Long id) {
        Cozinha cozinha = buscar(id);

        if (cozinha == null) {
            throw new EmptyResultDataAccessException(1);
        }
        maneger.remove(cozinha);
    }

}