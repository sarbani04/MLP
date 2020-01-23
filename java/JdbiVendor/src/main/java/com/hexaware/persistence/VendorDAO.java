package com.hexaware.persistence;
import com.hexaware.model.Vendor;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import com.hexaware.persistence.VendorMapper;
/**
 * VendorDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
     /**
     * @return the all the Vendor record.
     * VEN_ID, VEN_NAME, VEN_PASSWORD, VEN_EMAIL, VEN_MOBILE, VEN_ADDRESS
     */
    @SqlQuery("SELECT V.VEN_ID, V.VEN_NAME, V.VEN_PASSWORD,"
    + " V.VEN_EMAIL, V.VEN_MOBILE, V.VEN_ADDRESS FROM Vendor V;")
    @Mapper(VendorMapper.class)
    List<Vendor> show();
}