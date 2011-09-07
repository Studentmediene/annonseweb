package no.annonseweb.service.impl;

import no.dusken.annonseweb.models.*;
import no.dusken.annonseweb.service.SaleService;
import org.springframework.stereotype.Service;
import no.dusken.common.service.impl.GenericServiceImpl;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by IntelliJ IDEA.
 * User: maskinist
 * Date: 14/04/11
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
@Service("SaleService")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.DEFAULT, readOnly = true)
public class SaleServiceImpl extends GenericServiceImpl implements SaleService{

    public SaleServiceImpl(){
        super(Sale.class);
    }

}
