soaexpert-classes
=================

Códigos e outros documentos para os projetos exemplo desenvolvidos no curso Formação SOA da SOA|Expert.

## Tópicos ##
 
  1. [Tooltips](#tooltips)
      1. [Baixando o Fonte](#baixando-o-fonte)
      1. [Atualizando o fonte](#atualizando)
      1. [Add, Commit e Push](#commit)
      1. [Importe os projetos no workspace do Eclipse](#eclipse)
  2. [Rede Social DeMacho](#rede-social-demacho)

## Tooltips ##
Dica para quem não usa Git ainda e outras dicas para uso no repositório.

### Baixando o fonte ###
Para baixar o repositório com os fontes na máquina (apenas a primeira vez), faça 
os passos abaixo no diretório onde quer os códigos, ele irá criar a pasta soaexpert-classes e colocará o código dentro. 
Caso não possua git na máquina, use um `sudo apt-get install git`.

    git clone https://github.com/raffaine/soaexpert-classes.git

### Atualizando o fonte (Pegar a última versão do repositório central) <a name="atualizando"></a>###
Na pasta onde está o repositório (se seguiu o passo acima, será a `soaexpert-classes`, realize o comando abaixo:

    git pull

### Add, Commit e Push (Como commitar e enviar dados para o servidor) <a name="commit"></a>###
No git, as mudanças primeiro devem ser colocadas no __stage__, ou seja, no pacote de coisas que serão commitadas. Para isso 
utilize o comando `git add <files>`, lembrando que vale usar coisas como * para pegar vários arquivos, e.g `git add *.java`.
Para saber o que está ou não no __stage__, use o comando `git status`. Para adicionar tudo que não está staged ainda, basta 
usar o comando:

    git add .
    
Após adicionados os itens necessários no __stage__, você pode commitar, porém, como o Git é distribuído, seu commit será 
local. Caso você use apenas o comando `git commit`, ele abrirá o editor de texto padrão para editar a mensagem do commit. 
Para fazer um processo inline, use a opção `-m "mensagem"`, e caso queira realizar o comando anterior antes do commit, use 
a opção `-a`, assim ele primeiro adiciona tudo no __stage__ e depois faz o commit. Portanto, segue o comando:

    git commit -m "mensagem"
    
Para fechar, é importante quando tiver terminado, enviar os códigos para o repositório central. O jeito rápido, é realizar 
um __push__ do seu repositório para o repositório do github, que como você fez um __clone__, será denominado __origin__. 
Portanto, o comando final:

    git push origin

### Importe os projetos no seu Workspace do Eclipse <a name="eclipse"></a>###
Para quem usa eclipse, o repositório está com os `.project` do eclipse. Então, de forma bem fácil você consegue importar 
no eclipse. Abra o eclipse, e clique com o botão direito do mouse na parte vazia do `Project Explorer`. Escolha a opção 
`Import > Import ...`. Na Dialog que abrirá, escolha `General > Existing Projects into Workspace`, aperte `Next` e no 
campo `root  directory` ponha o caminho para o diretório do projeto dentro do repositório e pressione `Ok`. Ele mostrará 
o projeto na tela `Projects`, aí basta selecionar e meter um `Finish`.

## Rede Social DeMacho ##
Fontes localizados na pasta `DeMacho/` que também contém arquivos para uso no eclipse.
 
Documentação disponível no [Google Drive](https://docs.google.com/document/d/1OdQxQo0NSCUCVxz0kj2QMxtGDS1eWXu4VsPUZMzUTvU/edit?usp=sharing).
 
