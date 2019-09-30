
1.1 - criar um projeto


	c) usei o browser

	d) para criraro projeto entrei na pasta IES , atraves do terminal e utilizei a seguinte linha de comandos: 


			" o que está na pagina web recomendada"


	

	# package    groupId: o ID do grupo que desenvolveu o projeto. Por convenção, o valor desse campo é o domínio da instituição invertido. 	
    # nome projeto	    artifactId: o ID do projeto. Exemplos: simple-project, my-java-project.
            version: a versão atual do projeto. Exemplos: 1.0-SNAPSHOT(significa “versão 1.0 em desenvolvimento”), 2.4.2.




		PARA A VERSAO DO COMPILADOR USEI




			<plugins>
   	 <plugin>    
        <artifactId>maven-compiler-plugin</artifactId>
        <configuration>
            <source>1.8</source>
            <target>1.8</target>
        </configuration>
    </plugin>
	</plugins>


maven clean up
