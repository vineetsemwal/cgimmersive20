import { Pipe, PipeTransform } from '@angular/core';

@Pipe({"name":'substring'})
export class SubstringPipe implements PipeTransform{
    transform(original: string, ...args: number[]) {
        if(args.length==undefined || args.length==0){
            return original;
        }

        const start:number=args[0];
         if(args.length==1){
           let substring=  original.substring(start);
           return substring; 
        }

        const end:number=args[1];
        let substring=original.substring(start,end);
        return substring;


    }

}