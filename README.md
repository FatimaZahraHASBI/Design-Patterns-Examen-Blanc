# Design-Patterns-Examen-Blanc
## 1.	Diagramme de classe du modèle en appliquant les design patterns appropriés.<br>
Dans cet exercice j'ai travaillé avec les design pattern ssuivants :<br>
&ensp; - Composite : une figure peut être soit un rectangles ou un cercles ou un groupe de figures <br>
&ensp; - Observer : A chaque fois que l’état de l'objet paramètrage change, toutes les figures doivent être notifiées pour se mettre à jour. <br>
&ensp; - Strategy : Pour le traitement des dessins, on veut qu'au moment de l'exécution l’objet dessin peut changer d’algorithme avec un autre de la même famille et chaque algorithme peut évoluer indépendamment de la classe dessin qui les utilise <br><br><br>
![image](https://user-images.githubusercontent.com/63150702/198702630-5264b3c5-2610-4ad9-ad93-af5a917a2af8.png)
<br><br>
## 2. Implémentation du modèle en utilisant un projet Maven sans prendre en considération des aspects techniques.

&ensp;&ensp;&nbsp;L’initialisation du projet : <br><br>
![image](https://user-images.githubusercontent.com/63150702/198566163-a853ff89-19f2-4a34-a9fd-79ffa4610f9c.png)
<br><br>&ensp;&ensp;&nbsp;L’architecture du projet : <br><br>
![image](https://user-images.githubusercontent.com/63150702/198566197-6ba5443d-2a82-4ae2-bd25-870b991b9fe2.png)
<br><br>&ensp;&ensp;&nbsp;L'implémentation des classes : 
<br><br>
## Classe Figure
![image](https://user-images.githubusercontent.com/63150702/198731563-0af2cd1d-7de1-4cee-93fa-7c9e12994112.png)
<br><br>
## Classe Point 
![image](https://user-images.githubusercontent.com/63150702/198731670-a83b8b8d-5cf6-4f5e-9061-7bd3a84c7920.png)
<br><br>
## Classe Rectangle
![image](https://user-images.githubusercontent.com/63150702/198732011-37799015-c342-431b-a693-0a6c84d08008.png)
<br><br>
## Classe Cercle
![image](https://user-images.githubusercontent.com/63150702/198732302-abfb410f-cdac-4abe-a633-d3618cb92886.png)
<br><br>
## Classe Groupe
![image](https://user-images.githubusercontent.com/63150702/198732815-f6738a7d-c9db-482e-af6c-f3bb2aaa4529.png)
<br><br>
## Interface Parametrage (le role de observable)
![image](https://user-images.githubusercontent.com/63150702/198732916-82662e78-fd9c-4c30-9196-19d128b6d3fc.png)
<br><br>
## Classe ParamImpl (l'implémentation de l'interface Parametrage)
![image](https://user-images.githubusercontent.com/63150702/198733178-fb0a7670-bc3c-4b0a-a2f7-6209153c2236.png)
<br><br>
## Interface Observer 
![image](https://user-images.githubusercontent.com/63150702/198733268-7c4f4455-3e92-4eae-9cb2-a775f96c8c18.png)
<br><br>
## Interface Traitement
![image](https://user-images.githubusercontent.com/63150702/198733404-91ebbe50-e860-4962-b4de-ee0f9ad0e58a.png)
<br><br>
## Classe TraitementImpl1
![image](https://user-images.githubusercontent.com/63150702/198733496-b89e52ad-4a6f-46e0-a063-d9253dbd4c6e.png)
<br><br>
## Classe TraitementImpl2
![image](https://user-images.githubusercontent.com/63150702/198733557-5386ab7c-8e98-41f4-861f-d15697361f33.png)
<br><br>
## Classe Dessin
![image](https://user-images.githubusercontent.com/63150702/198733733-327902c1-b350-4f5f-a2bc-1457e880eaaf.png)
<br><br>
## 3. Effectuer des Tests du modèle.<br><br>
<br><br>
## Application main
![image](https://user-images.githubusercontent.com/63150702/198733831-b9b77bd7-5930-4531-a9d7-7683e7923dad.png)
<br><br>
## Résultat sur console
![Screenshot (168)](https://user-images.githubusercontent.com/63150702/198735047-51c954af-6a8d-4278-860c-5a3878cba797.png)
