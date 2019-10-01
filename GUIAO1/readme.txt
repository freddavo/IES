
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

MAVEN GOAL?


	O objetivo principal do Maven é facilitar e uniformizar todas as fases de construção de um projeto. Para que o Maven alcance esta meta,utiliza o conceito de repositórios, que podem ser de dois tipos: remotos e locais. Os repositórios remotos ficam num servidor web e centralizam todas as bibliotecas Java, sejam elas bibliotecas open source utilizadas como dependências ou artefatos dos próprios projetos da empresa, que por sua vez podem ser utilizados como dependências de outros projetos. Já o repositório local é, basicamente, uma pasta na máquina do desenvolvedor onde são gravadas as bibliotecas que este precisa ter para construir seus projetos.





EX 1.2
 1.2b

	URL para acesso ao repositório

		git@github.com:freddavo/IES.git


