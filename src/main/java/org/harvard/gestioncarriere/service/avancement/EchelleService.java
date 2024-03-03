package org.harvard.gestioncarriere.service.avancement;

import org.harvard.gestioncarriere.bean.avancement.Echelle;
import org.harvard.gestioncarriere.dao.avancement.EchelleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EchelleService {
    public Echelle findByRef(String ref) {
        return echelleDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return echelleDao.deleteByRef(ref);
    }

    public List<Echelle> findAll() {
        return echelleDao.findAll();
    }

    public int save(Echelle echelle) {
        if (echelle.getRef()!=null){
            return -1;
        }else {
            echelleDao.save(echelle);
            return 1;
        }
    }

    @Autowired
    private EchelleDao echelleDao;
}
