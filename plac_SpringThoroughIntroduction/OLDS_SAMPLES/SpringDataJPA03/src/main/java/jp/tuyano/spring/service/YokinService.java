package jp.tuyano.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.tuyano.spring.domain.model.Yokin;
import jp.tuyano.spring.domain.repository.YokinRepository;

@Service
public class YokinService {

	/**
	 * 
	 */
	@Autowired
	private YokinRepository yokinRepository;

	/**
	 * 
	 * @return
	 */
	public List<Yokin> findAll() {
		return yokinRepository.findAll();
	}
}
