package reflection.advance_level.dependency_injection_using_reflection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Test class for DIContainer
class DIContainerTest {
    private DIContainer diContainer;

    @BeforeEach
    void setUp() {
        diContainer = new DIContainer();
    }

    @Test
    void testDependencyInjection() throws Exception {
        // Register services
        diContainer.register(ServiceA.class);
        diContainer.register(ServiceB.class);

        // Retrieve instances
        ServiceA serviceA = diContainer.getInstance(ServiceA.class);
        ServiceB serviceB = diContainer.getInstance(ServiceB.class);

        // Assertions
        assertNotNull(serviceA, "ServiceA should be created");
        assertNotNull(serviceB, "ServiceB should be created");
       // assertNotNull(serviceA.getServiceB(), "ServiceB should be injected into ServiceA");
        //assertSame(serviceB, serviceA.getServiceB(), "Injected ServiceB should match registered instance");
    }

    @Test
    void testUnregisteredDependencyReturnsNull() {
        ServiceA serviceA = diContainer.getInstance(ServiceA.class);
        assertNull(serviceA, "Unregistered dependencies should return null");
    }
}

