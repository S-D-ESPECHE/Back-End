package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Rol;
import com.portfolio.mgb.Security.Enums.RolNombre;
import com.portfolio.mgb.Security.Repository.iRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
