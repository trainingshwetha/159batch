package com.mphasis.training.view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.mphasis.training.daos.CandidateDao;
import com.mphasis.training.pojos.Candidate;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
		
		System.out.println("Sorted list of candidates acccording to city names");
		Comparator<Candidate> comp=
			(c1, c2)->  c1.getCity().compareTo(c2.getCity());
			
			CandidateDao.getCandidateList()
		.stream().sorted(comp)
		.forEach(System.out::println);	
		
		
		System.out.println("Sorted list of candidates acccording to years of experience");
		Comparator<Candidate> yearsComp=
				(c1,c2)->c1.getYearsOfExperience()-c2.getYearsOfExperience();
	
				CandidateDao.getCandidateList()
				.stream().sorted(yearsComp)
				.forEach(System.out::println);
						
		System.out.println("list of pune candidates");
		
		List<Candidate> puneCandidates=
				CandidateDao.getCandidateList()
				.stream()
				.filter((candidate)->candidate.getCity().equals("Pune"))
				.collect(Collectors.toList());
		//with method reference
		puneCandidates.forEach(System.out::println);
		//or with lambda
		puneCandidates.forEach((can)->System.out.println(can));
	
	
		System.out.println("Candidate count per city");
		//city name---count
		Map<String,List<Candidate>> cityCount=
				CandidateDao.getCandidateList().stream()
				.collect(Collectors.groupingBy(
						candaite-> candaite.getCity()));
		
		for(String city:cityCount.keySet()) {
			System.out.println(city+ " "+cityCount.get(city).size());
//			List<Candidate> candidates=cityCount.get(city);
//			System.out.println(candidates.size());
		}
		System.out.println("Candidate Count by Technical Expertise");
		Map<String,List<Candidate>> technicalCount=
				CandidateDao.getCandidateList().stream()
				.collect(Collectors.groupingBy(
						candaite-> candaite.getTechnicalExpertise()));
		
		for(String city:technicalCount.keySet()) {
			System.out.println(city+ " "+technicalCount.get(city).size());
//			List<Candidate> candidates=cityCount.get(city);
//			System.out.println(candidates.size());
		}
		
		
		System.out.println("Fresher Candidate List");
		
		List<Candidate> fresherCandidates=
		CandidateDao.getCandidateList()
		.stream()
		.filter((candidate)->candidate.getYearsOfExperience()==0)
		.collect(Collectors.toList());
		fresherCandidates.forEach(System.out::println);
		
		System.out.println("List highest experince candidate");
Integer maxYear=
	CandidateDao.getCandidateList()
	.stream()
	.map((candidate)->candidate.getYearsOfExperience())
	.max(Integer::compare)
	.get();
		
		System.out.println(maxYear);
	List<Candidate> seniorCandidates=
		CandidateDao.getCandidateList()
		.stream()
		.filter((candidate)->candidate.getYearsOfExperience()==maxYear)
		.collect(Collectors.toList());
		seniorCandidates.forEach(System.out::println);
	}
}