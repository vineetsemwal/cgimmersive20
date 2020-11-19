import { Pipe, PipeTransform } from '@angular/core';


@Pipe({"name":"smallest"})
export class SmallestPipe implements PipeTransform{
    transform(input:number[]) :number{
       
        let smallest=input[0];

        for(let i=0;i<input.length;i++){
           if(smallest> input[i]){
               smallest=input[i];
           }
        }

        return smallest;

    }

}