package com.hexaware.persistence;
import com.hexaware.model.Customer;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import com.hexaware.persistence.CustomerMapper;
/**
 * EmployDAO class used to fetch data from data base.
 * @author hexware
 */
public interface CustomerDAO {
     /**
     * @return the all the Employ record.
     */
    @SqlQuery("SELECT C.CUS_ID, C.CUS_NAME, C.CUS_PASSWORD, C.CUS_EMAIL,"
    + " C.CUS_DOB, C.CUS_ADDRESS, C.CUS_MOBILE FROM CUSTOMER C;")
    @Mapper(CustomerMapper.class)
    List<Customer> show();

      /**
     * @return the Customer record.
     */
    @SqlQuery("SELECT C.CUS_ID, C.CUS_NAME, C.CUS_PASSWORD, C.CUS_EMAIL,"
    + " C.CUS_DOB, C.CUS_ADDRESS, C.CUS_MOBILE FROM CUSTOMER C WHERE C.CUS_ID=:cusId;")
    @Mapper(CustomerMapper.class)
    Customer searchById(@Bind("cusId") int cusId);
}