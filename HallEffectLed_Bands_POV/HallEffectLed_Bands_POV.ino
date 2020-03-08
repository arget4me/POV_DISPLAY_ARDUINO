#define PIXEL_PER_BAND 90

uint32_t palette[4] = {-65536, -256, -16711936, -16777216, };

char bands[10 * PIXEL_PER_BAND] = {0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 1, 1, 0, 0, 3, 0, 0, 0, 0, 3, 1, 1, 0, 0, 3, 0, 0, 0, 3, 3, 1, 1, 0, 0, 3, 0, 0, 0, 3, 3, 1, 1, 0, 0, 3, 0, 0, 0, 3, 3, 1, 1, 0, 0, 0, 0, 0, 1, 3, 3, 1, 1, 1, 0, 0, 0, 0, 1, 3, 3, 1, 1, 1, 0, 3, 0, 0, 1, 3, 3, 3, 1, 1, 3, 3, 0, 0, 1, 3, 3, 3, 1, 1, 0, 3, 0, 0, 1, 3, 3, 3, 1, 0, 0, 3, 0, 0, 1, 1, 3, 3, 3, 0, 0, 3, 0, 0, 1, 1, 3, 3, 3, 1, 0, 3, 0, 0, 1, 1, 3, 3, 1, 1, 0, 3, 0, 0, 1, 1, 1, 3, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 3, 1, 1, 0, 0, 0, 0, 1, 1, 1, 3, 1, 1, 1, 3, 0, 0, 1, 1, 3, 3, 3, 1, 0, 3, 0, 0, 1, 1, 3, 3, 3, 0, 0, 3, 0, 0, 1, 3, 3, 3, 1, 0, 0, 3, 0, 0, 1, 3, 3, 3, 1, 1, 0, 3, 0, 0, 1, 3, 3, 3, 1, 1, 3, 3, 0, 0, 1, 3, 3, 1, 1, 1, 0, 3, 0, 0, 1, 3, 3, 1, 1, 1, 0, 0, 0, 0, 0, 3, 3, 1, 1, 0, 0, 0, 0, 0, 0, 3, 3, 1, 1, 0, 0, 3, 0, 0, 0, 3, 3, 1, 1, 0, 0, 3, 0, 0, 0, 0, 3, 1, 1, 0, 0, 3, 0, 0, 0, 0, 0, 1, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 3, 3, 3, 3, 3, 2, 3, 0, 0, 0, 3, 3, 3, 3, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 2, 3, 3, 3, 2, 2, 2, 0, 0, 2, 2, 3, 3, 3, 2, 2, 2, 0, 0, 2, 2, 3, 3, 2, 2, 2, 2, 0, 0, 2, 2, 2, 3, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 3, 2, 2, 2, 2, 0, 0, 2, 2, 3, 3, 2, 2, 2, 2, 0, 0, 2, 2, 3, 3, 3, 2, 2, 2, 0, 0, 2, 2, 3, 3, 3, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 3, 3, 3, 2, 2, 2, 2, 0, 0, 0, 3, 3, 3, 3, 2, 2, 2, 0, 0, 0, 3, 3, 3, 3, 3, 2, 3, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, };



#define HALL_EFFECT_SWITCH_PIN 2
#include <math.h>

volatile unsigned long microsTimePerLap;
unsigned long timeold;
unsigned long loopTimer = 0;
volatile unsigned long targetLoopTime = 0;
volatile unsigned int loopIndexCounter = 0;




//------------------NEOPIXEL----------------------------------------------

// A basic everyday NeoPixel strip test program.

// NEOPIXEL BEST PRACTICES for most reliable operation:
// - Add 1000 uF CAPACITOR between NeoPixel strip's + and - connections.
// - MINIMIZE WIRING LENGTH between microcontroller board and first pixel.
// - NeoPixel strip's DATA-IN should pass through a 300-500 OHM RESISTOR.
// - AVOID connecting NeoPixels on a LIVE CIRCUIT. If you must, ALWAYS
//   connect GROUND (-) first, then +, then data.
// - When using a 3.3V microcontroller with a 5V-powered NeoPixel strip,
//   a LOGIC-LEVEL CONVERTER on the data line is STRONGLY RECOMMENDED.
// (Skipping these may work OK on your workbench but can fail in the field)
#include <Adafruit_NeoPixel.h>

// Which pin on the Arduino is connected to the NeoPixels?
// On a Trinket or Gemma we suggest changing this to 1:
#define LED_PIN    6

// How many NeoPixels are attached to the Arduino?
#define LED_COUNT 10

// Declare our NeoPixel strip object:
Adafruit_NeoPixel strip(LED_COUNT, LED_PIN, NEO_GRB + NEO_KHZ800);
// Argument 1 = Number of pixels in NeoPixel strip
// Argument 2 = Arduino pin number (most are valid)
// Argument 3 = Pixel type flags, add together as needed:
//   NEO_KHZ800  800 KHz bitstream (most NeoPixel products w/WS2812 LEDs)
//   NEO_KHZ400  400 KHz (classic 'v1' (not v2) FLORA pixels, WS2811 drivers)
//   NEO_GRB     Pixels are wired for GRB bitstream (most NeoPixel products)
//   NEO_RGB     Pixels are wired for RGB bitstream (v1 FLORA pixels, not v2)
//   NEO_RGBW    Pixels are wired for RGBW bitstream (NeoPixel RGBW products)

//------------------NEOPIXEL----------------------------------------------





//----------SETUP - runs once at startup ---------------------------------
void setup() {
  //Serial.begin(9600);
  pinMode(HALL_EFFECT_SWITCH_PIN, INPUT_PULLUP);
  attachInterrupt(digitalPinToInterrupt(HALL_EFFECT_SWITCH_PIN), magnet_detect, RISING);//Initialize the intterrupt pin (Arduino digital pin 2)
  microsTimePerLap = 10000;
  timeold = millis();


  strip.begin();           // INITIALIZE NeoPixel strip object (REQUIRED)
  strip.show();            // Turn OFF all pixels ASAP
  //strip.setBrightness(10);
  strip.setBrightness(255);
}


//---------LOOP - runs repeatedly as long as board is on -----------------
void loop()
{
  if (microsTimePerLap > 0) {
    loopTimer = micros();
    float delta  = (float(micros() - timeold) / float(microsTimePerLap));
    
    //unsigned int index = round(((float)PIXEL_PER_BAND) * delta);
    //index %= PIXEL_PER_BAND;

    unsigned int index = loopIndexCounter++;
    if(index >= PIXEL_PER_BAND)index = PIXEL_PER_BAND - 1;

    index = (index + PIXEL_PER_BAND/2)%PIXEL_PER_BAND;

    unsigned int pixel_index = index * 10;
    for(int i = 0; i < 10; i++)
    {
      strip.setPixelColor(i, palette[bands[pixel_index + i]]);
    }strip.show();

    while(micros() - loopTimer < targetLoopTime)
    {
      //delayMicroseconds(1);
      
    }
  }
}


//This function is called whenever a magnet/interrupt is detected by the arduino
void magnet_detect()
{
  unsigned long timenow = micros();

  //Calculate moving average over time per lap
  #define MOVING_AVERAGE_WINDOW 10
  static unsigned long movingAverage[MOVING_AVERAGE_WINDOW] = {0};
  static unsigned long movingAverageIndex = 0;
  static unsigned long movingAverageCount = 0;
  if(movingAverageCount < MOVING_AVERAGE_WINDOW)
  {
    movingAverageCount++;
  }

  movingAverage[movingAverageIndex] = (timenow - timeold);
  movingAverageIndex = (movingAverageIndex + 1) % MOVING_AVERAGE_WINDOW;
  microsTimePerLap = 0;
  for(int i = 0; i < movingAverageCount; i++)
  {
    microsTimePerLap = microsTimePerLap + movingAverage[i];
  }
  if(movingAverageCount != 0)
  {
    microsTimePerLap = microsTimePerLap / movingAverageCount;  
  }

  //Calculate time per pixel in image
  targetLoopTime = (microsTimePerLap / PIXEL_PER_BAND);

  //Reset timer
  timeold = timenow;

  //Reset loop index counter
  loopIndexCounter = 0;
}
