package bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import model.Owner;
import model.Vet;
import services.OwnerService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	

	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 Owner owner1 = new Owner();
	        //owner1.setId(1L);
	        owner1.setFirstName("Behlül");
	        owner1.setLastName("Köksoya");

	        ownerService.save(owner1);

	        Owner owner2 = new Owner();
	       // owner2.setId(2L);
	        owner2.setFirstName("Berat");
	        owner2.setLastName("Köksoya");

	        ownerService.save(owner2);

	        System.out.println("Loaded owners......");

	        Vet vet1 = new Vet();
	       // vet1.setId(1L);
	        vet1.setFirstName("Glen");
	        vet1.setLastName("Johnson");

	        vetService.save(vet1);

	        Vet vet2 = new Vet();
	       // vet2.setId(2L);
	        vet2.setFirstName("Elizabeth");
	        vet2.setLastName("Queen");

	       vetService.save(vet2);

	        System.out.println("Loaded vets.....");
		
		
		
	}

}
