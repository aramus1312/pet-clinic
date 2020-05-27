package services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import model.Owner;
import model.Pet;
import model.Vet;
import services.CrudService;
import services.VetService;


@Service
public class VetServiceMap extends AbstracMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	

}
