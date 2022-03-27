package com.hendisantika.repository;

import com.hendisantika.entity.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-restful-api-vuejs
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/03/22
 * Time: 19.10
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
