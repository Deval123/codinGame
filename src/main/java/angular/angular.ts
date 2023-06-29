import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ExampleService {
  private data: string[];

  constructor() {
    this.data = [];
  }

  getData(): string[] {
    return this.data;
  }

  addData(item: string): void {
    this.data.push(item);
  }

  clearData(): void {
    this.data = [];
  }
}
/*Maintenant, examinons les différents termes utilisés :

  @Injectable: C'est un décorateur fourni par Angular qui indique que la classe ExampleService peut être injectée avec des dépendances.
  Cela permet à Angular de créer des instances de ce service lorsqu'elles sont requises et de les fournir aux composants qui en ont besoin.

  attribut: Dans cet exemple, data est un attribut privé de la classe ExampleService.
  Il s'agit d'un tableau de chaînes de caractères qui stocke les données de ce service.

  composant: Un composant est une partie essentielle d'une application Angular.
  Dans cet exemple, nous ne montrons pas le composant, mais vous pouvez injecter ce service dans un composant en utilisant l'injection de dépendance.

  constructor(): C'est une méthode spéciale qui est appelée lorsqu'une instance de la classe ExampleService est créée.
  Dans cet exemple, nous initialisons simplement le tableau data à une liste vide.

  getData(): C'est une méthode publique qui retourne le tableau de données stockées dans le service.

  addData(item: string): C'est une méthode publique qui permet d'ajouter un nouvel élément au tableau de données.
  Elle prend un paramètre item de type string.

  clearData(): C'est une méthode publique qui réinitialise le tableau de données en le vidant.

  En utilisant ce service, vous pouvez injecter une instance de ExampleService dans un composant
  Angular et utiliser ses méthodes pour accéder et manipuler les données qu'il contient.
*/