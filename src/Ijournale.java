IEtudiant StudRep= new EtudiantRepository();
	    IUniversite UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    Universite univ= UnivRep.GetById(id_universite);

	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
