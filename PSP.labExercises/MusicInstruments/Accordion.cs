using System;

namespace PSP.labExercises.Instruments
{
    class Accordion : MusicInstrument
    {
        protected override void Play()
        {
            Console.WriteLine("Accordion is playing Slav music");
        }
        protected override void Tune()
        {
            Console.WriteLine("Accordion is tuned");
        }
    }
}
