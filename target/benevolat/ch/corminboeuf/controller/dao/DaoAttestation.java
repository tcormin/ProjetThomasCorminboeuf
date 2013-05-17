package ch.corminboeuf.controller.dao;

import java.util.ArrayList;

import ch.corminboeuf.model.Attestation;

public class DaoAttestation {

	private ArrayList<Attestation> attestations = new ArrayList<Attestation>();

	public DaoAttestation(){
		Attestation a = new Attestation();
		this.attestations.add(a);
	}

	public ArrayList<Attestation> getAttestations() {
		return attestations;
	}

	public void setAttestations(ArrayList<Attestation> attestations) {
		this.attestations = attestations;
	}
	
}
