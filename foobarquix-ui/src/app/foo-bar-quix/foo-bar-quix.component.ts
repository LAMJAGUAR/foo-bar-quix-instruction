import { Component } from '@angular/core';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent {

  alreadyConvertedList: NumberConverted[] = [];

  constructor(private fooBarQuixService: FooBarQuixService) { }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber)
      .subscribe(
        response => {
          const numberConverted: NumberConverted = {numberToConvert: inputNumber, result: response.result};
          this.alreadyConvertedList.push(numberConverted);
        },
        error => {
          console.log("error :", error);
        }
      );
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
