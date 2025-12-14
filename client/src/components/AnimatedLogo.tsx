import React from 'react';

interface AnimatedLogoProps {
    className?: string;
}

const AnimatedLogo: React.FC<AnimatedLogoProps> = ({ className = 'w-24 h-24' }) => {
    return (
        <div className={`${className} bg-indigo-600 rounded-2xl flex items-center justify-center shadow-2xl overflow-hidden relative group cursor-default transition-transform hover:scale-105 duration-300`}>
            <svg
                viewBox="0 0 100 100"
                fill="none"
                xmlns="http://www.w3.org/2000/svg"
                className="w-2/3 h-2/3"
            >
                {/* Left Bracket */}
                <path
                    d="M35 25 C 20 25, 20 25, 20 40 L 20 45 C 20 50, 15 50, 10 50 C 15 50, 20 50, 20 55 L 20 60 C 20 75, 20 75, 35 75"
                    stroke="white"
                    strokeWidth="8"
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    className="origin-center animate-[pulse_3s_ease-in-out_infinite]"
                />

                {/* Right Bracket */}
                <path
                    d="M65 25 C 80 25, 80 25, 80 40 L 80 45 C 80 50, 85 50, 90 50 C 85 50, 80 50, 80 55 L 80 60 C 80 75, 80 75, 65 75"
                    stroke="white"
                    strokeWidth="8"
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    className="origin-center animate-[pulse_3s_ease-in-out_infinite_0.5s]"
                />

                {/* Magnifying Glass Handle */}
                <line
                    x1="60"
                    y1="60"
                    x2="85"
                    y2="85"
                    stroke="white"
                    strokeWidth="8"
                    strokeLinecap="round"
                    className="animate-[ping_3s_cubic-bezier(0,0,0.2,1)_infinite]"
                    style={{ animationDuration: '4s', opacity: 0.8 }}
                />

                {/* Magnifying Glass Circle */}
                <circle
                    cx="50"
                    cy="50"
                    r="18"
                    stroke="white"
                    strokeWidth="8"
                    className="animate-[spin_8s_linear_infinite]"
                    strokeDasharray="80 30"
                />

                {/* Inner dots/code representation */}
                <circle cx="50" cy="50" r="4" fill="white" className="animate-ping opacity-75" />

            </svg>

            {/* Glossy overlay effect */}
            <div className="absolute inset-0 bg-gradient-to-tr from-white/10 to-transparent pointer-events-none" />
        </div>
    );
};

export default AnimatedLogo;
