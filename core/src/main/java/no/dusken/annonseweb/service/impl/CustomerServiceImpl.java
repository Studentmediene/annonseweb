package no.dusken.annonseweb.service.impl;

import no.dusken.annonseweb.models.*;
import no.dusken.annonseweb.service.CustomerService;
import no.dusken.common.service.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maskinist
 * Date: 14/04/11
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */
@Service("CustomerService")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.DEFAULT, readOnly = true)
public class CustomerServiceImpl extends GenericServiceImpl implements CustomerService{

    public CustomerServiceImpl(){
        super(Customer.class);
    }

    @Override
    public List<Customer> getCustomers() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
