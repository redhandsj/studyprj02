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
	 * 全件取得
	 * @return
	 */
	public List<Yokin> findAll() {
		return yokinRepository.findAll();
	}

	/**
	 * 記録
	 * @return
	 */
	public void regist(final Yokin yokin) {
		yokinRepository.saveAndFlush(yokin);
	}

	/**
	 * 記録
	 * @return
	 */
	public void edit(final Yokin yokin) {
		yokinRepository.saveAndFlush(yokin);
	}

	/**
	 * 削除
	 * @return
	 */
	public void detele(final Long yokinId) {
		yokinRepository.delete(yokinId);
	}
}
