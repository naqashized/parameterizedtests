package com.parmeterizedtests.entities;

import com.parameterizedtests.entities.User;
import junit.framework.TestCase;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

/**
 * Created by Techphile on 7/12/2015.
 */
@RunWith(JUnitParamsRunner.class)
public class UserParameterizedTest extends TestCase {

    //providing data using Object[]
    private static final Object[] getUsers() {
        return new Object[] {
                new Object[] {"Bond", 30,"London Main Boulevard"},
                new Object[] {"Superman",35,"New York Main Boulevard"}
        };
    }
    //providing data using $() approach. no property can have null value when using this
    private static final Object[] getUsersUsing$() {
        return $(
                $("Lorem Ipsum", 40,"Lorem Main Boulevard"),
                $("Lorem Lahi",55,"Lahi Main Boulevard")
        );
    }
    @Test
    @Parameters(method = "getUsers")
    public void constructorShouldSetNameAgeAddressWithObjectMethod(String name,int age,String address){

        User user=new User(name,age,address);
        assertEquals(name, user.getName());
        assertEquals(age, user.getAge());
    }
    @Test
    @Parameters(method = "getUsersUsing$")
    public void constructorShouldSetNameAgeAddressWith$Method(String name,int age,String address){

        User user=new User(name,age,address);
        assertEquals(name, user.getName());
        assertEquals(age, user.getAge());
    }
    @Test
    @Parameters({
            "Michael, 30,Michael Main Boulevard",
            "David, 30,David Main Boulevard"

    })
    public void constructorShouldSetNameAgeAddressWithDataMethod(String name,int age,String address){

        User user=new User(name,age,address);
        assertEquals(name, user.getName());
        assertEquals(age, user.getAge());
    }

}
